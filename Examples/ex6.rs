fn main(){
   let v = vec![1,2,3];
   let d = &v;
   let mut w = *d;
   w[0] = 2;
   print!(w[0]);
   print!(v[0]);
}