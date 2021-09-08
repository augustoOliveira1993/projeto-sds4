import NavBar from "components/NavBar";
import Footer from "components/Footer";
import DataTable from "components/DataTable";

function App() {
  return (
    <div>
      <>
        <NavBar />
        <div className="container">
          <h1 className="text-primary py-3">Dashboard de Vendas</h1>
        </div>
        <DataTable />

        <Footer />
      </>
    </div>
  );
}

export default App;
