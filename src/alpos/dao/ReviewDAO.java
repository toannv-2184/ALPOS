package alpos.dao;

import alpos.entity.Review;

public interface ReviewDAO extends GenericDAO<Review, Integer> {
	public Long countReview(Integer userId);
}
