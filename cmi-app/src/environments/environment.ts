// The file contents for the current environment will overwrite these during build.
// The build system defaults to the dev environment which uses `environment.ts`, but if you do
// `ng build --env=prod` then `environment.prod.ts` will be used instead.
// The list of which env maps to which file can be found in `.angular-cli.json`.

export const environment = {
  name: 'local',
  production: false,
  apiBaseURL: '/api',
  notSecuredURL: ['assets/'],
};

const keyCloakUrl = 'http://localhost:8089';
export const openId = {
  LOGIN_URL: `${keyCloakUrl}/auth/realms/boilerplate-oauth2/protocol/openid-connect/auth`,
  ISSUER: `${keyCloakUrl}/auth/realms/boilerplate-oauth2`,
  REDIRECT_URL: 'https://localhost:4200',
  CLIENT_ID: 'boilerplate-oidc',
  SCOPE: '',
  LOGOUT_URL: 'https://localhost:4200',
  useSilentRefresh: true,
  silentRefreshRedirectUri: 'https://localhost:4200/silent-refresh.html'

};
