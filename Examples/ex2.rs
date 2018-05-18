fn factorielle(n : i32, result : &i32)
{
	let mut i = 1;
	if n==0
	{
		let b = 5;
		*result = 1;

	} else{
		let gh = 42;
        *result = 1;
		while i <= n
		{
			*result = *result * i;
			i = i+1;
		}
	}
}

fn main(){
	let mut v = 0;
	factorielle(5,&v);
	print!(v);
}