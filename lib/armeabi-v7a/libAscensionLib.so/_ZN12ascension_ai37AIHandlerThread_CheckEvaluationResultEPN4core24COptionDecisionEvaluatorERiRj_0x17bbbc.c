// 函数: _ZN12ascension_ai37AIHandlerThread_CheckEvaluationResultEPN4core24COptionDecisionEvaluatorERiRj
// 地址: 0x17bbbc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

*arg2 = 0xffffffff
uint32_t r5 = *ascension_ai::g_pAIHandlerThread

if (r5 != 0)
    int32_t r0 = pthread_self(0xffffffff)
    
    if (pthread_equal(*(r5 + 8), r0) == 0)
        void* r7 = *ascension_ai::g_pAIHandlerThread
        
        if (pthread_mutex_trylock(r7 + 0x24) == 0)
            if (zx.d(*(r7 + 0x40)) == 0)
                pthread_mutex_unlock(r7 + 0x24)
                return 0
            
            void* r0_9
            int32_t* r7_1
            
            if (zx.d(*(r7 + 0x41)) == 0)
                r7_1 = arg2
                r0_9 = arg3
            else
                r0_9 = r7 + 0x48
                *arg3 = *r0_9
                r7_1 = r7 + 0x44
                *arg2 = *r7_1
                *(r7_1 - 4) = 0
                *(r7_1 - 0x14) = 0
                *(r7_1 - 0x10) = 0
                *(r7_1 - 0xc) = 0
                *(r7_1 - 8) = 0
            
            *r7_1 = 0xffffffff
            *r0_9 = 0
            pthread_mutex_unlock(r7 + 0x24, 0)
        else
            *arg2 = 0xffffffff
            *arg3 = 0
        
        return 1

return 0
