package araay;

public class Queuesimulation {


	    /**
	     * @param args the command line arguments
	     */
	    int next_event_type,num_custs_delayed,num_delays_required,num_events,num_in_q,server_status;
	    float area_num_in_q,area_server_status,mean_interarrival,mean_service,time;
	    //float time_arrival[Q_LIMIT+1];
	    float time_next_event[];
	    float time_last_event,total_of_delays;
	    public void initialize ()//initialization function
	    {     
	      time=(float) 0.0;
	      //initialize the state counters
	      num_custs_delayed=0;
	      total_of_delays=(float)0.0;
	      area_num_in_q=(float) 0.0;
	      area_server_status=(float) 0.0;
	      /*initialize event list.Since no customers are present the departure(service 
	       * completion)event is eliminated from consideration
	       */
	      time_next_event[1]=(float) (time+Math.exp(mean_interarrival));
	      time_next_event[2]=(float) 1.0e+30;
	    }
	    public void timing ()//timing function
	    {
	        int i;
	        float min_time_next_event=(float) 1.0e+2;
	        //determine the event of the next event to occur
	        for(i=1;i<=num_events;++i){
	            if (time_next_event[i]<min_time_next_event){
	                min_time_next_event=time_next_event[i];
	                next_event_type=i;
	        }
	    }
	        //check to see whether the evnt list is empty
	        if(next_event_type==0){
	            //the event list is empty so stop the simulation
	        exit();    
	        }
	        //the event list is not empty so advance the simulation clock
	        time=min_time_next_event;
	    }   
	    public void arrival ()//arrival event function
	    {
	        float delay;
	        //schedule next arrival
	        time_next_event[1]=(float) (time+Math.exp(mean_interarrival));
	        int BUSY;
	        //check to see whether server is busy
	        if (server_status==BUSY){
	            //server is busy so increment the number of customers in queue
	            ++num_in_q;
	            //check to see whether an overflow condition exists
	            if (num_in_q>Q_LIMIT){
	                //the queue has overflowed so stop the simulation
	                exit();
	            }
	            float[] time_arrival;
	            /*there is still room in the queue so store the time of arrival of
	             * the arriving customer at the (new)and of time arrival
	             */
	            time_arrival[num_in_q]=time;
	        }else{
	            /*server is idle so arriving customer has a delay of zero(the following 
	             * two statements are for program clarity and do not affect the results
	             * of the simulation
	             */
	            delay=(float) 0.0;
	            total_of_delays+=delay;
	            //increment the number of customers delayed and make server busy
	            ++num_custs_delayed;
	            server_status=BUSY;
	            //schedule a departure(service completion)
	            time_next_event[2]=(float) (time+Math.exp(mean_service));
	        }
	     
	    }
	    public void depart()//departure event function
	    {
	        int i;
	        float delay;
	        //check to see whether the queue is empty
	        if(num_in_q==0){
	            int IDLE = 0;
	            /*the queue is empty so make the server idle and eliminate the departure
	             * (service completion)event from consideration
	             */
	            server_status=IDLE;
	            time_next_event[2]=(float) 1.0e+30;
	        }else{
	            //the queue is nonempty so decrement the number of customers in queue
	            --num_in_q;
	            float[] time_arrival = null;
	            /*compute the delay of the customer who is beginning service and update
	             * the total delay accumulator
	             */
	            delay=time-time_arrival[1];
	            total_of_delays+=delay;
	            //increment the number of customers delayed and schedule departure
	            ++num_custs_delayed;
	            time_next_event[2]=(float) (time+Math.exp(mean_service));
	            //move each customer in queue(if any) up on one place
	            for(i=1;i<=num_in_q;++i){
	                //time_arrival[i]=time_arrival[i+1];
	            }
	        }
	    }
	    public void report ()//report generator function
	    {
	        //compute and write estimates of desired measures of performance
	        
	    }
	    public void update_time_avg_stats()//update area accumulators for time-average statistics
	    {
	        float time_since_last_event;
	        //compute time since last event and update last_event_time marker
	        time_since_last_event=time-time_last_event;
	        time_last_event=time;
	        //update area under number_in_queue function
	        area_num_in_q+=num_in_q * time_since_last_event;
	        //update area under server busy indicator function
	        area_server_status+=server_status*time_since_last_event;
	    }
	    public void main(String[] args) {
	        // specify the number of events for the timing function
	        num_events=2;
	        initialize();
	        //run the simulation while more delays are still needed
	        while(num_custs_delayed<num_delays_required){
	            //determine the next event
	            timing();
	            //update time average statistical accumulators
	            update_time_avg_stats();
	            //invoke the appropriate event function
	            switch(next_event_type){
	                case 1:
	                    arrival();
	               break;
	                case 2:
	                    depart();
	                    break;
	            }
	        }
	        //invoke the report generator and end the simulation
	        report();
	            }
	}

