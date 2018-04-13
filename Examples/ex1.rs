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

fn testreturn () -> bool {
return 15;
}


fn main () {
    let n=0;
    
	let mut total = 0;
	let mut i = 0;
	let mut d = true;
    let a = 3;
    c=3;
    a=4;
        
    
    d=5;
    let n=5;
    let puissance =4;
    let mut b : bool =true;

    b=puissance(2,3);
    
	let e : bool = 15;
	let g = vec![1,2];
	let mut h = vec![vec![1,2],vec![2,4]];
	let f =vec![vec![1,2],vec![1,2,3]];
	let j= vec![1,true];
	let k=vec![vec![1,2],vec![true,false]];
	let l= g[2];
	let m = notdef[2];
	let o= i[1]; 
	let p= g[true];
	let q:i32 = {
		let n = 6;
		12};
	let r = &2;  /* pas censé fonctionner, à gerer*/
	let s = &n;
	let t = &(6+3);
	let iuaelrzh= &g;
	let u = 1+2;
	let v= true * 2;
	let w = 3- false;
	let x = true/false;
	let y = !2;
	let z= !true;
	let aa= 1||2;
	let ab= true||false;
	let ac= 3&&false;
	let ad= true && 4;
	let ae= 1==2;
	let af= true !=false;
	let ag= 1!=true;
	let ah= false == 2;
	let ai= g==2;
	let aj= 1<2;
	let ak= true >2;
	let al= false >= true;
	let am= g <= false;
	let an = *1;
	let ao = *s;
	let ap = *g;
	let aq= -1;
	let ar= -true;
	let as = -g;
	let at=vec![1,2,3];  /* should not be able to add from diif size */
	h[1]=at;



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
