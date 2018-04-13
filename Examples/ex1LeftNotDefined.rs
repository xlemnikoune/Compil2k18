fn main () {

	let mut total = 0;
	let mut i = 0;
	let n = 10;
	j=4;

	let mut test = i <= n ;
	while test
	{
		total = total + i * i;
		i = i + 1;

		if i == 5
		{
			print !(5);
		}
		test = i <= n;
	}
	print !( total );
	
}