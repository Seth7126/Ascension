// 函数: _ZN20NetworkClientManager6UpdateEv
// 地址: 0x182fe0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
char* entry_r0
void* r1 = *(entry_r0 + 4)
uint32_t r0_1

if (r1 != 0)
    r0_1 = zx.d(*(r1 + 0x18))

if (r1 == 0 || (r0_1 == 0 && zx.d(*(r1 + 0x19)) == 0))
    *(entry_r0 + 0x8e) = 0
    __builtin_memset(&entry_r0[0xb0], 0, 0x20)
    *(entry_r0 + 0x98) = 0
    *(entry_r0 + 0x9c) = 0xffffffff
    *(entry_r0 + 0xa0) = 0
    *(entry_r0 + 0xa4) = 0
    *(entry_r0 + 0xa8) = 0
else
    int32_t str
    uint32_t r1_3
    
    if (zx.d(entry_r0[0x8d]) == 0)
        r1_3 = zx.d(entry_r0[0x8e])
    else
        r1_3 = zx.d(entry_r0[0x8e])
        
        if (r1_3 == 0 && r0_1 != 0)
            if (zx.d(entry_r0[0xc]) != 0)
                NetworkClientManager::SendCreateAccountLogin(entry_r0)
            else if (zx.d(entry_r0[0xd]) != 0 && zx.d(entry_r0[0xe]) != 0
                    && zx.d(entry_r0[0x4f]) != 0)
                int32_t var_1b0_1 = 0
                int32_t var_1b4 = 0xabababab
                int32_t var_1ac_1 = 0xc1
                int32_t var_1a8_1 = 1
                int32_t var_1a4_1 = 0
                void var_1a0
                __aeabi_memcpy(&var_1a0, &entry_r0[0xe], 0x41)
                sprintf(&str, "pd%-14s", &entry_r0[0x4f])
                uint32_t i_1 = zx.d(str.b)
                int32_t r0_9
                int32_t r3_1
                
                if (i_1 == 0)
                    r3_1 = 0x1505
                    r0_9 = 0
                else
                    void* r1_7 = &str:1
                    r0_9 = 0
                    r3_1 = 0x1505
                    uint32_t i
                    
                    do
                        int32_t r3_2
                        int32_t r5_3
                        r5_3:r3_2 = mulu.dp.d(r3_1, 0x21)
                        i = zx.d(*r1_7)
                        r1_7 += 1
                        int32_t r6_1 = i_1 << 0xfffffffc s>> 0x18
                        r3_1 = r3_2 + r6_1
                        r0_9 = adc.d(r5_3 + r0_9 * 0x21, r6_1 s>> 0x1f, r3_2 + r6_1 u< r3_2)
                        i_1 = i
                    while (i != 0)
                
                int32_t var_15f_1 = r3_1
                int16_t var_157_1 = 0x4e45
                char var_155_1 = 0
                int32_t var_14c_1 = 2
                char var_148_1 = 0
                int32_t var_15b_1 = r0_9
                int32_t* r0_12 = *(entry_r0 + 4)
                *(entry_r0 + 0x90) = 0
                (*(*r0_12 + 8))(r0_12, &var_1b4, 0x8c)
            
            entry_r0[0x8d] = 0
            *(entry_r0 + 0xc) = 0
            r1_3 = zx.d(entry_r0[0x8e])
    
    if (r1_3 != 0 && zx.d(entry_r0[0x94]) == 0)
        int32_t r0_14 = *(entry_r0 + 0x514)
        int32_t r1_10 = *(entry_r0 + 0x518)
        
        if (r1_10 != r0_14)
            int32_t r5_4 = (r1_10 - r0_14) s>> 2
            int32_t r6_2 = 0
            
            while (true)
                void* r0_15 = *(r0_14 + (r6_2 << 2))
                
                if (r0_15 != 0)
                    operator delete(r0_15)
                
                r6_2 += 1
                
                if (r6_2 u>= r5_4)
                    break
                
                r0_14 = *(entry_r0 + 0x514)
            
            r0_14 = *(entry_r0 + 0x514)
        
        *(entry_r0 + 0x518) = r0_14
        int32_t var_118_1 = 0
        int32_t var_11c_1 = 0
        int32_t var_120_1 = 0
        int32_t var_124_1 = 0
        str = 0xbbbbbbbb
        int32_t* r0_16 = *(entry_r0 + 4)
        (*(*r0_16 + 8))(r0_16, &str, 0x14)
        entry_r0[0x94] = 1
    
    CReliableTCPConnectionIPV6::ProcessQueues(*(entry_r0 + 4), 
        NetworkClientManager::ReceiveNetworkMessage)
    time_t r0_18 = time(nullptr)
    
    if (r0_18 - *(entry_r0 + 8) s>= 2)
        int32_t r0_21 = *(entry_r0 + 4)
        *(entry_r0 + 8) = r0_18
        CReliableTCPConnectionIPV6::ProcessTimeout(r0_21)

int32_t r0_22 = *__stack_chk_guard

if (r0_22 == r0)
    return r0_22 - r0

__stack_chk_fail()
noreturn
