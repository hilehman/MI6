package bgu.spl.mics;

import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;


/**
 * The {@link MessageBrokerImpl class is the implementation of the MessageBroker interface.
 * Write your implementation here!
 * Only private fields and methods can be added to this class.
 */

public class MessageBrokerImpl implements MessageBroker {

	//***  fields  ***
	private ConcurrentHashMap<Subscriber, BlockingQueue<Message>> subscriberMessagesQueuesMap; //holds subscribers and their messages queue
	private ConcurrentHashMap<Class<? extends Message>, Queue<Subscriber>> messageSubscribersQueueMap; // holds messages and subscribed subscribers queue
	private ConcurrentHashMap<Event, Future> eventFutureMap; // holds Events and their Future
	//   private final Object lock;  // QQQ need to understand what it does




	//***  constructor (singleton, thread-safe)  ***
	private static class SingletonHolder {
		private static MessageBrokerImpl messageBroker = new MessageBrokerImpl();
	}

	/**
	 * Retrieves the single instance of this class.
	 */
	public static MessageBroker getInstance() {
		return SingletonHolder.messageBroker;
	}

	private MessageBrokerImpl(){  // initializes fields
		messageSubscribersQueueMap = new ConcurrentHashMap<>();
		subscriberMessagesQueuesMap = new ConcurrentHashMap<>();
		eventFutureMap = new ConcurrentHashMap<>();
		//    lock = new Object(); // QQQ need to understand what it does

	}

	@Override
	public <T> void subscribeEvent(Class<? extends Event<T>> type, Subscriber s) {




		// TODO Auto-generated method stub
	}

	@Override
	public void subscribeBroadcast(Class<? extends Broadcast> type, Subscriber s) {
		// TODO Auto-generated method stub

	}

	@Override
	public <T> void complete(Event<T> e, T result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void sendBroadcast(Broadcast b) {
		// TODO Auto-generated method stub

	}


	@Override
	public <T> Future<T> sendEvent(Event<T> e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void register(Subscriber s) {
/*		BlockingQueue<Message> subQueue;
		messageQueuesMap.put(m, subQueue);*/

	}

	@Override
	public void unregister(Subscriber s) {
		// TODO Auto-generated method stub

	}

	@Override
	public Message awaitMessage(Subscriber s) throws InterruptedException {
		// TODO Auto-generated method stub
		return null;
	}



}