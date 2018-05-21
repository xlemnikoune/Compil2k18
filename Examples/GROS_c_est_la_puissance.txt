fn affichage(vect : &vec<vec<i32>>) {
	let mut i=0;
	while (i<7) {
		print!("|");
		let mut j=0;
		while (j<7) {
			if (*vect[i][j]==0) {
				raw_print!("  ");
			} if (*vect[i][j] ==1) {
				raw_print!("x ");
			}
			 if (*vect[i][j] ==2) {
				raw_print!("o ");
			}
			j=j+1;
		}
		i=i+1;
	}
	print!(" ______________ ");
}

fn resultat(vect : &vec<vec<i32>>) -> bool {
	let mut i=0;
	while (i<7) {
		let mut j=0;
		while (j<7) {
			if (*vect[i][j]==1) {
				if ( j+3<7) {
					if (*vect[i][j+1]==1 && *vect[i][j+2]==1 && *vect[i][j+3] == 1) {
						print!("Player 1 wins!");
						return true;
					}
				}
				if ( i+3<7) {
					if (*vect[i+1][j]==1 && *vect[i+2][j]==1 && *vect[i+3][j] == 1) {
						print!("Player 1 wins!");
						return true;
					}
				}
				if ( i+3 <7 && j+3 <7) {
					if (*vect[i+1][j+1]==1 && *vect[i+2][j+2]==1 && *vect[i+3][j+3] == 1) {
						print!("Player 1 wins!");
						return true;
					}
				}
	
			} if (*vect[i][j]==2) {
					
if ( j+3<7) {
					if (*vect[i][j+1]==2 && *vect[i][j+2]==2 && *vect[i][j+3] == 2) {
						print!("Player 2 wins!");
						return true;
					}
				}
				if ( i+3<7) {
					if (*vect[i+1][j]==2 && *vect[i+2][j]==2 && *vect[i+3][j] == 2) {
						print!("Player 2 wins!");
						return true;
					}
				}
				if ( i+3 <7 && j+3 <7) {
					if (*vect[i+1][j+1]==2 && *vect[i+2][j+2]==2 && *vect[i+3][j+3] == 2) {
						print!("Player 2 wins!");
						return true;
					}
				}
			}
		
		}

	}
	return false;	
}
fn clean() {
	let mut i=0;
	while (i<65) {
		print!("  ");
		i=i+1;
	}
}

fn main() {
	
	let mut v0= vec ![0,0,0,0,0,0,0];
	let mut v1= vec ![0,0,0,0,0,0,0];
	let mut v2= vec ![0,0,0,0,0,0,0];
	let mut v3= vec ![0,0,0,0,0,0,0];
	let mut v4= vec ![0,0,0,0,0,0,0];
	let mut v5= vec ![0,0,0,0,0,0,0];
	let mut v6= vec ![0,0,0,0,0,0,0];

	let mut v= vec ![v0,v1,v2,v3,v4,v5,v6];
	let mut i=1;
	let mut a=0;
	
	while(!resultat(&v)){
		affichage(&v);
		a=-1;
		if (i==1){
			a=input("Player 1, it is your turn!");
			if (a>7 || a<0) {
				print!("This isn't a valid play! Choose your column between 0 and 6!");
			} else {
				if ( v[0][a]==0) {
					v[0][a]==1;
					i=2;
				}else{
					 if ( v[1][a]==0) {
						v[1][a]==1;
						i=2;
					}else{
						 if ( v[2][a]==0) {
							v[2][a]==1;
							i=2;
						}else {
							if ( v[3][a]==0) {
								v[3][a]==1;
								i=2;
							}else {
								if ( v[4][a]==0) {
									v[4][a]==1;
									i=2;
								
								}else{
									if ( v[5][a]==0) {
										v[5][a]==1;
										i=2;
									}else {
										if ( v[6][a]==0) {
											v[6][a]==1;
											i=2;
										} else {
											print!("This column is full, try an other one pls");
										}
									}
								}
							}
						}
					}
				}
			}
		}
		if (i==2) {
			a=input("Player 2, it is your turn!");
			if (a>7 || a<0) {
				print!("This isn't a valid play! Choose your column between 0 and 6!");
			} else {
				if ( v[0][a]==0) {
					v[0][a]==2;
					i=1;
				}else {
					if ( v[1][a]==0) {
						v[1][a]==2;
						i=1;
					}else {
						if ( v[2][a]==0) {
							v[2][a]==2;
							i=1;
						}else {
							if ( v[3][a]==0) {
								v[3][a]==2;
								i=1;
							}else {
								if ( v[4][a]==0) {
									v[4][a]==2;
									i=1;
								}else {
									if ( v[5][a]==0) {
										v[5][a]==2;
										i=1;
									}else {
										if ( v[6][a]==0) {
											v[6][a]==2;
											i=1;
										} else {
											print!("This column is full, try an other one pls");
										}
									}
								}
							}
						}
					}
				}
			}
		}
		clean();	
	}
	

}