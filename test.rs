struct data {
	x:i32,
	y:bool
}

struct data{
	shouldNotExist:i32
}

struct wrongStruct{
	error: string
}

fn noReturn(a:i32) -> i32 {
	let i = 9;
	let h = data{x:9,y:true};
	let g = newStruc{g:15};
	if i{
		return 5;
	}
}

fn noReturn(bis:bool) -> i32 {
	5+6
}

fn noVec(t : vec<i32>){
	print!(9);
}

fn lotParam(a:i32,b:bool,c:i32){
	print!(a);
}

fn main(){
	noReturn(true);
	lotParam(5,true,9,false);
	lotParam(5,true);
	let c = 1+a;
	while 1 {
		print!(1);
	}
}