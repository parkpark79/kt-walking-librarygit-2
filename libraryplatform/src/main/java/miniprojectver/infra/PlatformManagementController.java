package miniprojectver.infra;

import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import miniprojectver.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//<<< Clean Arch / Inbound Adaptor

@RestController
// @RequestMapping(value="/platformManagements")
@Transactional
public class PlatformManagementController {

    @Autowired
    PlatformManagementRepository platformManagementRepository;
}
//>>> Clean Arch / Inbound Adaptor
