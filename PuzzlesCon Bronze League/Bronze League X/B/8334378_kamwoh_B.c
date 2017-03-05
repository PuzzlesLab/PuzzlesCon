def getSeq1(n):
	if n == 1:
		return 1

	seq = 1
	index = 1
	while seq%n != 0: #if this loop stop, which mean seq is divisble by n, ret index
		seq += pow(10, index)
		index += 1
	return index

try:
	while True:
		n = int(input())
		print(getSeq1(n))
except EOFError:
	pass