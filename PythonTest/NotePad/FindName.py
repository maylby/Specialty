# Промежуточная контрольная работа по блоку специализация
# Урок 1. Приложение заметки (Python)
# https://gb.ru/lessons/432765/homework

'''
Поиск
'''
class FindName(object):

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