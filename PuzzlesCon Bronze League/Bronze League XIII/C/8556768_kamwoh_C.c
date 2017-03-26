while True:
	s = input()
	if s == '0 0':
		break
	m, n = [int(i) for i in s.split()]
	ans = str(pow(m,n,10))
	print(ans[-1])