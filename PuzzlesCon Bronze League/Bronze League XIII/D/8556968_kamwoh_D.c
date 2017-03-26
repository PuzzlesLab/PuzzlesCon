count = 1
while True:
	s = input()
	if s == '0 0 0 0':
		break
	z, i, m, l = [int(x) for x in s.split()]
	countseq = 0
	set_rand = set([])
	while True:
		n = (z*l+i)%m
		if n in set_rand:
			break
		set_rand.add(n)
		countseq += 1
		l = n
	print('Case '+str(count)+': '+str(countseq))
	count += 1