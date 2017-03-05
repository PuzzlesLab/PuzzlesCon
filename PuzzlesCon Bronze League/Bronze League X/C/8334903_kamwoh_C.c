
def getAns(a,b):
	if a%2==0:
		a += 1
	if b%2==0:
		b -= 1
	d = 2 #odd
	# nth = a + (n-1)d
	# b = a + (n-1)d
	# n-1 = (b-a)/d
	# n = (b-a)/d + 1
	n = (b-a)/d + 1
	return int((n/2)*(2*a + (n-1)*d))

testcase = int(input())

for i in range(testcase):
	a = int(input())
	b = int(input())
	ans = getAns(a,b)
	print('Case '+str(i+1)+': '+str(ans))