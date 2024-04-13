# Промежуточная контрольная работа по блоку специализация
# Урок 1. Приложение заметки (Python)
# https://gb.ru/lessons/432765/homework


'''
Создание новой записи
'''
class Creator:
    
    def create(list_1):
        listes = list_1
        with open('phonebook.txt','w+', encoding='utf-8') as Phone:
            for i in listes:
                Phone.write(f'{i[0]},{i[1]}\n') # ФИО: 'i[0]', номер: 'i[1]'
            list_1 += listes
        return list_1 # добавил возврат 'list_1'
    # create()