// 函数: _ZN12ascension_ai20AIHandlerThread_InitEv
// 地址: 0x17b904
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t r0 = *ascension_ai::g_pAIHandlerThread

if (r0 != 0)
    return r0

void** r0_1 = operator new(0x50)
__builtin_memset(&r0_1[0xc], 0, 0x12)
r0_1[1].b = 0
*ascension_ai::g_pAIHandlerThread = r0_1
*r0_1 = _vtable_for_ascension_ai::AIHandlerThread + 8
r0_1[0x11] = 0
r0_1[0x12] = 0
r0_1[0x13].b = 0
pthread_mutex_init(&r0_1[0xa], 0)
pthread_cond_init(&r0_1[0xb], 0)
pthread_mutex_init(&r0_1[9], 0)
pthread_attr_init(&r0_1[3])
pthread_attr_setdetachstate(&r0_1[3], 1)
pthread_attr_setscope(&r0_1[3], 0)
int32_t temp0 = 0
uint32_t i = pthread_create(&r0_1[2], &r0_1[3], ascension_ai::AIHandlerThread::ThreadMain, r0_1)

while (i != 0)
    i u>>= 1
    temp0 += 1

uint32_t r0_11 = (0x20 - temp0) u>> 5
r0_1[1].b = r0_11.b
return r0_11
