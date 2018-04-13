 struct vecteur
 {
 	x : i32 ,
 	y : i32
 }

 struct data
 {
 	vx : i32,
 	vy : i32,
 	to_add : bool
 }
 
 fn addition_vecteurs (l : &vec<data>) -> vecteur
 {
 	let mut i = 0;
 	let mut result = vecteur { x : 0 , y : 0};


 	while i <= (*l).len()
 	{
 		if (*l)[i].to_add
 		{
 			result.x = result . x + *l [ i ].vx ;
 			result.y = result . y + *l [ i ].vy ;
 		}
 		i = i + 1;
 	}

 	return result ;
 }

 fn main ()
 {
 	let d1 = data { vx:0, vy:0 , to_add : true };
 	let d2 = data { vx:1, vy:1 , to_add : true };
 	let d3 = data { vx:2, vy:2 , to_add : false };
 	let d4 = data { vx:3, vy:4 , to_add : true };

 	let l = vec ![ d1 , d2 , d3 , d4 ];
 	let result = addition_vecteurs ( &l ) ;

 	print !( result . x ) ;
 	print !( result . y ) ;
 }