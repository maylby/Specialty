# Промежуточная контрольная работа по блоку специализация
# Урок 1. Приложение заметки (Python)
# https://gb.ru/lessons/432765/homework

'''
Поиск
'''
class FindName:

    def __findName__(self, name, nike):
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