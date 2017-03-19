
def printTranspose(matrix, maxlen):
	mat = []
	
	for y in range(maxlen):
		mat.append([])
		for x in range(len(matrix)-1,-1,-1):
			try:
				s = matrix[x]
				mat[y].append(s[y])
			except:
				mat[y].append(' ')
		
	for m in mat:
		s = ''.join(m1 for m1 in m)
		# s = s.rstrip()
		print(s)


class mat(object):
	def __init__(self, s, slen):
		self.s = s
		self.slen

	def __repr__(self):
		return self.s

	def __str__(self):
		return self.s

matrix = []
maxlen = 0
while True:
	try:
		s = input()
		# print(type(s))
		# print(int(s) == 0)
		#if s == '0':
		#	raise EOFError
		if len(s) > maxlen:
			maxlen = len(s)
		matrix.append(s)
	except EOFError:
		printTranspose(matrix, maxlen)
		break

