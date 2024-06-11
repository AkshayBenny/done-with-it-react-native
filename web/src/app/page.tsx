import SearchLineIcon from 'remixicon-react/SearchLineIcon'
import ArrowRightLineIcon from 'remixicon-react/ArrowRightLineIcon'

export default function Home() {
	return (
		<main className='w-screen h-screen bg-gradient-to-br from-black to-[#2B2B2B] flex items-center justify-center'>
			<form className='flex flex-col items-center justify-center w-[40%]'>
				<div className='flex w-full items-end justify-start pb-2'>
					<h1 className='text-white text-start text-3xl font-semibold uppercase pl-3'>
						Insight
					</h1>
					<p className='text-white uppercase'>Engine</p>
				</div>
				<div className='w-full flex gap-4'>
					<div className='border-white bg-white border-2 rounded-full overflow-clip flex items-center gap-4 px-2 py-2 w-full group  transition'>
						<SearchLineIcon className='text-[#2B2B2B] w-6 h-6 transition group-hover:animate-pulse' />
						<input
							type='text'
							placeholder='Enter your query here'
							className='focus:outline-none focus:border-0 focus:ring-0 w-full bg-white text-[#2B2B2B]'
						/>
					</div>
					<button className='rounded-full p-3 bg-white group hover:bg-black transition'>
						<ArrowRightLineIcon className='text-[#2B2B2B] group-hover:text-white transition'></ArrowRightLineIcon>
					</button>
				</div>
			</form>
		</main>
	)
}
