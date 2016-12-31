package dao;

import java.util.List;

import model.Todo;

public interface TodoDAO {
	Todo getTodoById(final long id);
	 List<Todo> getTodoListByUser(final long userId);
	 List<Todo> getTodoListByUserAndTitle(final long userId, final String title);
	 Todo create(final Todo todo);
	  Todo update(Todo todo);
	  void remove(final Todo todo);

}
