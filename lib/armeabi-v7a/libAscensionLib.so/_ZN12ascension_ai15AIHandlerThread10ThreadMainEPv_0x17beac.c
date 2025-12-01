// 函数: _ZN12ascension_ai15AIHandlerThread10ThreadMainEPv
// 地址: 0x17beac
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

pthread_mutex_lock(arg1 + 0x28)

while (zx.d(*(arg1 + 0x4c)) == 0)
    pthread_mutex_lock(arg1 + 0x24)
    
    if (zx.d(*(arg1 + 0x40)) == 0 || zx.d(*(arg1 + 0x41)) != 0)
        pthread_mutex_unlock(arg1 + 0x24)
        int32_t r0_6 = pthread_self()
        
        if (pthread_equal(*(arg1 + 8), r0_6) != 0)
            pthread_cond_wait(arg1 + 0x2c, arg1 + 0x28)
    else
        int32_t* r0_10 = *(arg1 + 0x30)
        int32_t r0_11 =
            (*(*r0_10 + 8))(r0_10, *(arg1 + 0x34), *(arg1 + 0x38), *(arg1 + 0x3c), arg1 + 0x48)
        
        if (r0_11 != 0xffffffff)
            *(arg1 + 0x44) = r0_11
        
        if (r0_11 != 0xffffffff)
            *(arg1 + 0x41) = 1
        
        pthread_mutex_unlock(arg1 + 0x24)

pthread_mutex_unlock(arg1 + 0x28)
pthread_mutex_lock(arg1 + 0x24)
*(arg1 + 4) = 0
pthread_mutex_unlock(arg1 + 0x24)
return 0
