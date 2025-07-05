describe('Expense.fyi Login Test', () => {
  it('Should log in with valid credentials', () => {
    cy.visit('https://expense.fyi/login');
    cy.get('input[name=email]').type('test@example.com');
    cy.get('input[name=password]').type('test1234');
    cy.contains('Login').click();
    cy.url().should('include', '/dashboard');
  });
});
