import java.util.PriorityQueue;

public class PriorityQueueTest{
	public static void main(String[] args){
		PriorityQueue pq = new PriorityQueue();
		//下面代码依次向pq中加入四个元素
		pq.offer(6);
		pq.offer(-3);
		pq.offer(20);
		pq.offer(18);
		//输出队列，并不是按加入顺序排列
		System.out.println(pq);
		//访问队列的第一个元素，其实就是队列中最小的元素
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
	}
}