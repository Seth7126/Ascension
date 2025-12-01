// 函数: _ZN22CReliableUDPConnection7ReceiveERK11sockaddr_inPKcj
// 地址: 0xba98c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t result = 0

if (memcmp(arg1 + 8, arg2, 0x10) == 0 && *arg3 == 0xabcdef0)
    clock_t r0_3 = clock()
    int32_t r1 = *(arg1 + 0x34)
    *(arg1 + 0x1c) = r0_3
    
    if (r1 != 0)
        while (true)
            void* r0_5 = *(arg1 + 0x30)
            void* r7 = *(r0_5 + 8)
            
            if (*(r7 + 0xc) u>= *(arg3 + 8))
                break
            
            void* r2_1 = *r0_5
            *(r2_1 + 4) = *(r0_5 + 4)
            **(r0_5 + 4) = r2_1
            *(arg1 + 0x34) = r1 - 1
            operator delete(r0_5)
            
            if (r7 != 0)
                operator delete(r7)
                r1 = *(arg1 + 0x34)
                
                if (r1 == 0)
                    break
            else
                r1 = *(arg1 + 0x34)
                
                if (r1 == 0)
                    break
    
    int32_t r0_6 = *(arg3 + 4)
    result = 1
    
    if (r0_6 u>= *(arg1 + 0x28))
        void** r5_1 = *(arg1 + 0x3c)
        void* __offset(sockaddr_in, 0x38) r10_1 = arg1 + 0x38
        
        if (r10_1 != r5_1)
            do
                int32_t r1_4 = *(r5_1[2] + 8)
                
                if (r1_4 == r0_6)
                    return result
                
                if (r1_4 u> r0_6)
                    r10_1 = r5_1
                    break
                
                r5_1 = r5_1[1]
            while (r10_1 != r5_1)
        
        int32_t* r0_7 = operator new(0x7e0)
        int32_t entry_r3
        *r0_7 = entry_r3 - 0xc
        __aeabi_memcpy4(&r0_7[1], arg3, entry_r3)
        int32_t* r0_9 = operator new(0xc)
        r0_9[2] = r0_7
        *r0_9 = 0
        void* r1_7 = *r10_1
        *(r1_7 + 4) = r0_9
        *r0_9 = r1_7
        *r5_1 = r0_9
        r0_9[1] = r10_1
        *(arg1 + 0x40) += 1

return result
