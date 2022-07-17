

class Visitor:
   pass

class Cat : 
  def __init__(self, name, age) -> None:
    self.name = name
    self.age = age

  def speak(self):
    print("meow")

  def accept(self, visitor :Visitor):
    # 순환?
    print("use implementation of Visitor")
    visitor.visit(self)



class Visitor:
  def visit(self, elem: Cat):
    pass

class NameVisitor (Visitor):
  def visit(self, elem: Cat):
    print(elem.name)

class AgeVisitor(Visitor):
  def visit(self, elem: Cat):
    print(elem.age)


# client
kitty = Cat("kitty", 3)
kitty.speak()

name_visitor = NameVisitor()
kitty.accept(name_visitor)

age_visitor = AgeVisitor()
kitty.accept(age_visitor)

