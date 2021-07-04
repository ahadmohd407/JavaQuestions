void kthRemoveFromLast(int k)//FloydAlgorithm
{
	Node<T>p=start;
	Node<T>q=start;
	for(int i=1;i<=k;i++)
	{
		q=q.next;
	}
	while(q!=null)
	{
		q=q.next;
		p=p.next;
	}
	p.data=p.next.data;
	p.next=p.next.next;
}
