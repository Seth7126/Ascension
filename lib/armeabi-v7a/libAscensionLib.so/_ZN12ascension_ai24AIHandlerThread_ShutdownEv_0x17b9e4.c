// 函数: _ZN12ascension_ai24AIHandlerThread_ShutdownEv
// 地址: 0x17b9e4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t r5 = *ascension_ai::g_pAIHandlerThread

if (r5 == 0)
    return 

pthread_mutex_lock(r5 + 0x24)

if (zx.d(*(r5 + 0x40)) != 0)
    (*(**(r5 + 0x30) + 0xc))()
    __builtin_memset(r5 + 0x30, 0, 0x12)
    *(r5 + 0x44) = 0xffffffff
    *(r5 + 0x48) = 0

pthread_mutex_unlock(r5 + 0x24)
uint32_t r6_1 = *ascension_ai::g_pAIHandlerThread
pthread_mutex_lock(r6_1 + 0x24)
*(r6_1 + 0x4c) = 1
int32_t r0_6 = pthread_self(1)

if (pthread_equal(*(r6_1 + 8), r0_6) == 0 && pthread_mutex_trylock(r6_1 + 0x28) == 0)
    pthread_cond_signal(r6_1 + 0x2c)
    pthread_mutex_unlock(r6_1 + 0x28)

pthread_mutex_unlock(r6_1 + 0x24)

while (zx.d(*(r6_1 + 4)) != 0)
    pthread_mutex_lock(r6_1 + 0x24)
    
    if (pthread_equal(*(r6_1 + 8), r0_6) == 0 && pthread_mutex_trylock(r6_1 + 0x28) == 0)
        pthread_cond_signal(r6_1 + 0x2c)
        pthread_mutex_unlock(r6_1 + 0x28)
    
    pthread_mutex_unlock(r6_1 + 0x24)

int32_t* r0_24 = *ascension_ai::g_pAIHandlerThread

if (r0_24 != 0)
    (*(*r0_24 + 4))()

*ascension_ai::g_pAIHandlerThread = 0
