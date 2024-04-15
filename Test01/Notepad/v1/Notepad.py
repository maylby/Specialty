# Промежуточная контрольная работа по блоку специализация
# Урок 1. Приложение заметки (Python)
# https://gb.ru/lessons/432765/homework


'''
Напишите проект, содержащий функционал работы с заметками. 
Программа должна уметь создавать заметку, сохранять её, 
читать список заметок, редактировать заметку, удалять заметку.


"Вход/Выход"
'''
def outlog():
	picachu = input('\nПродолжить?\n1-да,\n2-нет\n: ')
	if picachu == '1': 
		start() # меню выбора действий
	elif picachu == '2':
		print('Пока!\n')
		exit() 
	else: 
		print('Введена не верная команда')
		outlog()


'''
Поиск
'''
def find_name():
	list_1 = reade() # чтение найденных данных
	name = input('Введите ФИО: ')
	filde = list(filter(lambda x: name in x[0], list_1))
	if len(filde):# != 0:
		for i in filde:
			print(i)
			outlog()
	else:
		nike = input('ФИО нет в списке контактов. Добавить?\n1-да\n2-нет\n: ')
		if nike == '1':
			add_name() # Добавить новый контакт
		if nike == '2':
			outlog() # возврат на страницу "Входа"
		else:
			print('Введена не верная команда')
			outlog()
# find_name()


'''
Удаление данных
'''
def delete():
	list_1 = reade()
	name = input('Введите ФИО: ')
	len_list_1 = len(list_1)
	rem = []
	for i in list_1:
		if name in i[0]:
			rem.append(i)
	if len(rem) != 0: print(*rem, sep ='\n')		
	if len(rem) == 1:
		list_1.remove(rem[0])
		create(list_1)
		outlog()
	elif len(rem) > 1:
		num = input('Введите номер телефона: ')
		for j in rem:
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
Редактор
'''
def redact(): 
	list_1 = reade()
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
			uno = input('Изменить ФИО-1, телефон-2\n: ')
			if uno == '1':
				list_1[list_1.index(i)][0] = input('ФИО: ') # Разделить имя и фамилию (?)
			elif uno == '2':
				list_1[list_1.index(j)][1] = input('Телефон: ')
			else: 
				print('Введена неверная команда')
				redact() 			
	bum = 0
	if len(find) > 1: 
		num = input('Введите номер телефона: ') 
		for j in find: 	
			# print(num, j[1])
			if num == j[1]:
				uno = input('Изменить: ФИ - 1, телефон - 2 ')
				if uno == '1':
					list_1[list_1.index(j)][0] = input('ФИ: ')
				elif uno == '2':
					list_1[list_1.index(j)][1] = input('Телефон: ')
				else:
					print('Введена неверная команда')
					redact()
			else: bum += 1
		if len(find) == bum: 
			print('Такого номера нет')
	create(list_1)
	outlog()	


'''
Добавить контакт 
'''
def add_name():
    list_1 = reade()
    saves = input('Создать контакт?\nда-1\nнет-2\n ')
    list_2 =[]
    if saves == '1':
        name = input('Введите новое ФИO: ')
        list_2.append(name)
        num = input('Введите номер телефона: ')
        list_2.append(num)
        if len(list(filter(lambda x: list_2 == x, list_1))) > 0:
            print('Такой номер и ФИO уже есть')
        else:
            list_1.append(list_2)
            create(list_1)
            print('Контакт добавлен')
            outlog()
    elif saves == '2':
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
	return list_1 # добавил возврат 'list_1'
# create()


'''
Чтение
'''
def reade(): 
	note = []
	with open('phonebook.txt','r', encoding='utf-8') as Phone:
		for i in Phone.readlines():
			note.append(i.strip().split(',')) 	
	return (note)
# note = reade()
# print(reade()) # закрыл строку за ненадобностью


'''
Пуск-меню
'''	
def start(): # В момент запуска, одновременно со списком пунктов, 
			 # код выдаёт список контактов. Как исправить?
	
	# data = show_menu() # Функция меню команд v2, данный код не работает (?),
                         # вызов пунктов меню - через блок "data = input()"

	data = input("\nВыбрать действие:\n"
			  	"1. Показать список контактов\n"
				"2. Hайти контакт\n"
				"3. Добавить контакт\n"
				"4. Редактировать контакт\n"
				"5. Удалить\n") 
	if data == '1': 
		# reade() # прямая ссылка на функцию работает криво
		note = reade()
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


"""
Функция "show_menu" (см. ниже) с кодом не конектится
"""	
# def show_menu():
# 	print("\nВыберите наобходимое действие:\n"
#           "1. Отобразить весь справочник\n"
#           "2. Найти обонента по фамилии\n"
#           "3. найти обонента по номеру телефона\n"
#           "4. Добавить абонента в справочник\n"
#           "5. Изменить данные\n"
#           "6. Сохранить справочник в текстовом формате\n"
#           "7. Закончить работу")
# 	data = int(input())
# 	return data


start()
