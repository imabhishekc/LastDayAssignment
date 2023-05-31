public record UserDTO(String username, String email) {
    public String getDisplayName() {
        return "User: " + username;
    }
}
