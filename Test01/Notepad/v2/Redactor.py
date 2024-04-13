# Промежуточная контрольная работа по блоку специализация
# Урок 1. Приложение заметки (Python)
# https://gb.ru/lessons/432765/homework


'''
Редактор
'''

class Redactor:
    
    def __redact__(self, find, num): 
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