package cinema.service;

import static org.springframework.security.core.userdetails.User.withUsername;

import cinema.model.Role;
import cinema.model.User;
import java.util.Arrays;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    private final UserService userService;

    public CustomUserDetailsService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userService.findByEmail(email).orElseThrow(
                () -> new UsernameNotFoundException("Can't find user by email: " + email));
        UserBuilder builder = withUsername(email);
        builder.password(user.getPassword());
        builder.roles(Arrays.toString(user.getRoles().stream()
                .map(Role::getRoleName)
                .toArray(Role.RoleName[]::new)));
        return builder.build();
    }
}
