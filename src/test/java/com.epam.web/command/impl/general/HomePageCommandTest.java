package com.epam.web.command.impl.general;

import com.epam.web.command.CommandResult;
import com.epam.web.command.impl.bookmaker.BookmakerHistoryCommand;
import com.epam.web.command.util.MatchDtoCommandHelper;
import com.epam.web.constant.Page;
import com.epam.web.controller.request.RequestContext;
import com.epam.web.exception.InvalidParametersException;
import com.epam.web.exception.ServiceException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.HashMap;
import java.util.Map;

public class HomePageCommandTest {
    private static final String VALID_REQUEST_HEADER = "controller?command=home-page&page=1";
    private static final Map<String, Object> SESSION_ATTRIBUTES = new HashMap<>();
    private static final Map<String, Object> REQUEST_ATTRIBUTES = new HashMap<>();
    private static final Map<String, String[]> REQUEST_PARAMETERS = new HashMap<>();
    private static final CommandResult EXPECTED_COMMAND_RESULT = CommandResult.forward(Page.HOME);

    private RequestContext requestContext;
    private HomePageCommand homePageCommand;

    @Before
    public void initMethod() {
        MatchDtoCommandHelper matchDtoCommandHelper = Mockito.mock(MatchDtoCommandHelper.class);
        requestContext = new RequestContext(REQUEST_ATTRIBUTES,
                REQUEST_PARAMETERS, SESSION_ATTRIBUTES, VALID_REQUEST_HEADER);
        homePageCommand =
                new HomePageCommand(matchDtoCommandHelper);
    }

    @Test
    public void testExecuteShouldReturnForward() throws ServiceException,
            InvalidParametersException {
        //given
        //when
        CommandResult actual = homePageCommand.execute(requestContext);
        //then
        Assert.assertEquals(EXPECTED_COMMAND_RESULT, actual);
    }
}
