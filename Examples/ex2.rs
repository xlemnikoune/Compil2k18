struct data {
	x : i32,
	y : bool
}

fn puissance(a : i32, b: i32) -> i32
{
	if b == 0
	{
		return 1;
	}

	let mut i = 1;
	let mut result = a;
	while i < b
	{
		result = result * a;
		i = i+1;
	}
	return result;
}

fn factorielle(n : i32, result : &i32)
{
	let mut i = 1;
	let mut j = true;
	let mut a = 10;
	let mut c = vec ! [1,3];
	a = {
		let d = 85;
		i=i+1;
		i+d
	};
	if n==0
	{
		*result = 1;

	} else{
        *result = 1;
		while i <= n
		{
			*result = *result * i;
			i = i+1;
		}
	}
}

fn main(){
	let x = data {x:7, y:true};
	let mut v = vec![vec![1,2],vec![1,4],vec![4,5],vec![6,7]];
	let mut a = vec![1,2];
	let mut b = 0;
	b=x.x;
	1+8;
	v[1][1] = puissance(1,2);
	a;
	factorielle(5,&b);
	print!(v);
}