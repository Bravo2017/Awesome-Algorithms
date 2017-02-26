//PsuedoCode for PARTITION
function PARTITION(A,p,r){
	x = A[r-1]
	i = p-1
	for k in range(p,r-1){
		if A[k] < x{
			i = i+1
			Exchange A[i] with A[k]
		}
		i = i+1
		Exchange A[i] with A[r-1]
		j=i
	}
	for k in range(i+1,r){
		if(A[k]==x){
			j = j+1
			Exchange A[j] with A[k]
		}
		k = k-1
	}
	return j,i
}

//PsuedoCode for RANDOMIZED_PARTITION
function RANDOMIZED_PARTITION(A,p,r){
	x = randome(p,r-1)
	Exchange A[x] with A[r-1]
	return PARTITION(A,p,r)
}


//PsuedoCode for QUICKSORT
function QUICKSORT(A,p,r){
	while (p<r-1){
		q,t = RANDOMIZED_PARTITION(A,p,r)
		if(q-p < r-t){
			QUICKSORT(A,p,q)
			p = t+1
		}
		else{
			QUICKSORT(A,t+1,r)
			r = q
		}
	}
}