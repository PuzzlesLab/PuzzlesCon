import datetime

def get40weeks(date):
	date_ = datetime.datetime.strptime(date, '%m%d%Y')
	newDate = date_ + datetime.timedelta(weeks=40)
	month = newDate.month
	if(newDate.month < 10):
		month = '0'+str(month)
	day = newDate.day
	if(newDate.day < 10):
		day = '0'+str(day)

	return newDate, str(month)+'/'+str(day)+'/'+str(newDate.year)

def getSign(dateObj):
	if(dateObj.month == 1):
		if(dateObj.day <= 20):
			return 'capricorn'
		else:
			return 'aquarius'
	elif(dateObj.month == 2):
		if(dateObj.day <= 19):
			return 'aquarius'
		else:
			return 'pisces'
	elif(dateObj.month == 3):
		if(dateObj.day <= 20):
			return 'pisces'
		else:
			return 'aries'
	elif(dateObj.month == 4):
		if(dateObj.day <= 20):
			return 'aries'
		else:
			return 'taurus'
	elif(dateObj.month == 5):
		if(dateObj.day <= 21):
			return 'taurus'
		else:
			return 'gemini'
	elif(dateObj.month == 6):
		if(dateObj.day <= 21):
			return 'gemini'
		else:
			return 'cancer'
	elif(dateObj.month == 7):
		if(dateObj.day <= 22):
			return 'cancer'
		else:
			return 'leo'
	elif(dateObj.month == 8):
		if(dateObj.day <= 21):
			return 'leo'
		else:
			return 'virgo'
	elif(dateObj.month == 9):
		if(dateObj.day <= 23):
			return 'virgo'
		else:
			return 'libra'
	elif(dateObj.month == 10):
		if(dateObj.day <= 23):
			return 'libra'
		else:
			return 'scorpio'
	elif(dateObj.month == 11):
		if(dateObj.day <= 22):
			return 'scorpio'
		else:
			return 'sagittarius'
	elif(dateObj.month == 12):
		if(dateObj.day <= 22):
			return 'sagittarius'
		else:
			return 'capricorn'


n = int(input())
for i in range(n):
	date = input()
	newDateObj, newDate = get40weeks(date)
	print(str(i+1)+' '+newDate+' '+getSign(newDateObj))
