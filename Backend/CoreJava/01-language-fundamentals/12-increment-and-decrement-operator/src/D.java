class D
{
	public static void main(String[] args)
	{
		int i = 0;
		int j = i++ + i + i;//0 + 1 + 1
		System.out.println(i);//1
		System.out.println(j);//2
	}
}