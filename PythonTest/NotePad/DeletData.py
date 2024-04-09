# Промежуточная контрольная работа по блоку специализация
# Урок 1. Приложение заметки (Python)
# https://gb.ru/lessons/432765/homework


'''
Удаление данных
'''
class DeletData:

    def __delete__(self, name, num):
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