# Промежуточная контрольная работа по блоку специализация
# Урок 1. Приложение заметки (Python)
# https://gb.ru/lessons/432765/homework


'''
Написать проект, содержащий функционал работы с заметками. 
Программа должна уметь создавать заметку, сохранять её, 
читать список заметок, редактировать заметку, удалять заметку.


"Вход/Выход"
'''
def outlog():
	action = input('\nПродолжить?\n1-да,\n2-нет\n: ')
	if action == '1': 
		start() # функция выбора действий
	elif action == '2':
		print('Пока!\n')
		exit() 
	else: 
		print('Введена не верная команда')
		outlog()


'''
Поиск
'''
def find_name():
	list_1 = read()
	name = input('Введите ФИО: ')
	field = list(filter(lambda x: name in x[0], list_1))
	if len(field):
		for i in field:
			print(i)
			outlog()
	else:
		reque = input('ФИО нет в списке контактов. Добавить?\n1-да\n2-нет\n: ')
		if reque == '1':
			add_name() # вызов функции "Добавление контакта"
		if reque == '2':
			outlog() # возврат в пункт "Вход/Выход"
		else:
			print('Введена не верная команда')
			outlog()
# find_name()


'''
Удаление данных
'''
def delete():
	list_1 = read()
	name = input('Введите ФИО: ')
	len_list_1 = len(list_1)
	removal = []
	for i in list_1:
		if name in i[0]:
			removal.append(i)
	if len(removal) != 0: print(*removal, sep ='\n')		
	if len(removal) == 1:
		list_1.remove(removal[0])
		create(list_1)
		outlog()
	elif len(removal) > 1:
		num = input('Введите номер телефона: ')
		for j in removal:
			if num == j[1]:
				list_1.remove(j)
				create(list_1)
				outlog()
		if len_list_1 == len(list_1):
			print('Нет номера')
			outlog()
	else: 
		print('Контакта нет') 
		outlog()
		

'''
Редактирование
'''
def redact(): 
	list_1 = read()
	red = input('Кого редактировать?\n: ')
	find = list(filter(lambda x: red in x[0], list_1))
	if len(find) != 0:
		for i in find: 
			print(i)
	else: 
		print('ФИО нет в контактах')
		outlog()
	if len(find) == 1:
		for i in find: 
			change = input('Изменить ФИО-1, телефон-2\n: ')
			if change == '1':
				list_1[list_1.index(i)][0] = input('ФИО: ') 
			elif change == '2':
				list_1[list_1.index(i)][1] = input('Телефон: ')
			else: 
				print('Введена неверная команда')
				redact() 			
	choice = 0
	if len(find) > 1: 
		num = input('Введите номер телефона: ') 
		for j in find: 	
			# print(num, j[1])
			if num == j[1]:
				change = input('Изменить: ФИО - 1, телефон - 2 ')
				if change == '1':
					list_1[list_1.index(j)][0] = input('ФИО: ')
				elif change == '2':
					list_1[list_1.index(j)][1] = input('Телефон: ')
				else:
					print('Введена неверная команда')
					redact()
			else: choice += 1
		if len(find) == choice: 
			print('Такого номера нет')
	create(list_1)
	outlog()	


'''
Добавление контакта 
'''
def add_name():
    list_1 = read()
    adds = input('Создать контакт?\n1 - да\n2 - нет\n')
    list_2 = []
    if adds == '1':
        name = input('Введите новое ФИO: ')
        list_2.append(name)
        num = input('Введите номер телефона: ')
        list_2.append(num)
        if len(list(filter(lambda x: list_2 == x, list_1))) > 0:
            print('Такой номер и ФИO уже есть')
        else:
            list_1.append(list_2)
            create(list_1) # вызов функции "Создание новой записи"
            print('Контакт добавлен')
            outlog()
    elif adds == '2':
        outlog()
    else:
        print('Введена неверная команда')
        outlog()
	# print(list_1)



'''
Создание новой записи
'''
def create(list_1):
	listes = list_1
	with open('phonebook.txt','w+', encoding='utf-8') as Phone:
		for i in listes:
			Phone.write(f'{i[0]},{i[1]}\n') # ФИО: 'i[0]', номер: 'i[1]'
		list_1 += listes
	return list_1 
# create()


'''
Чтение
'''
def read(): 
	note = []
	with open('phonebook.txt','r', encoding='utf-8') as Phone:
		for i in Phone.readlines():
			note.append(i.strip().split(',')) 	
	return (note)
# note = reade()
# print(reade()) 


'''
Меню "Пуск"
'''	
def start(): 

	data = input("\nВыбрать действие:\n"
			  	"1. Показать список контактов\n"
				"2. Hайти контакт\n"
				"3. Добавить контакт\n"
				"4. Редактировать контакт\n"
				"5. Удалить\n") 
	
	if data == '1': 
		# reade() # прямая ссылка на функцию работает криво
		note = read()
		print(*note, sep ='\n')
		outlog()
	elif data == '2': 
		find_name()
	elif data == '3': 
		add_name()
	elif data == '4': 
		redact()
	elif data == '5': 
		delete()

start()
