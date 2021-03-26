package jpa.service;

import java.util.List;
import jpa.dao.CourseDao;
import jpa.entitymodels.Course;

public class CourseService extends Services implements CourseDao {

	@Override
	public List<Course> getAllCourses() {
		List<Course> courses = null;

		connect();

		try {
			courses = em.createQuery("SELECT c FROM Course c", Course.class).getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dispose();
		}

		return courses;
	}

}
