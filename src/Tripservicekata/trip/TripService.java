package org.craftedsw.tripservicekata.trip;

import java.util.ArrayList;
import java.util.List;

import org.craftedsw.tripservicekata.exception.UserNotLoggedInException;
import org.craftedsw.tripservicekata.user.User;
import org.craftedsw.tripservicekata.user.UserSession;

public class TripService {

	public List<Trip> getTripsByUser(User user, User loggedUser) throws UserNotLoggedInException {
		validateLoggedUser(loggedUser);
		List<Trip> tripList = new ArrayList<Trip>();
		if (user.isFriend(loggedUser)) {
			tripList = findTripsByUser(user);
		}
		return tripList;
	}
	private void validateLoggedUser(User loggedUser) throws  UserNotLoggedInException{
		if(loggedUser == null) {
			throw new UserNotLoggedInException();
		}
	}
	

	private List<Trip> findTripsByUser(User user) {
		List<Trip> tripList;
		tripList = TripDAO.findTripsByUser(user);
		return tripList;
	}
	/*
	private User getLoggedUser() {
		User loggedUser = UserSession.getInstance().getLoggedUser();
		return loggedUser;
	}*/
	
}
