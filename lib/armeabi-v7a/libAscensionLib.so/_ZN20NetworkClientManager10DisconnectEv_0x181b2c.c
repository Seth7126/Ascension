// 函数: _ZN20NetworkClientManager10DisconnectEv
// 地址: 0x181b2c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
void* entry_r0

if (zx.d(*(entry_r0 + 0x8e)) != 0)
    int32_t* r0_2 = *(entry_r0 + 4)
    
    if (r0_2 != 0)
        int32_t var_20_1 = 0
        int32_t var_24 = 0xafafafaf
        (*(*r0_2 + 8))(r0_2, &var_24, 8)

*(entry_r0 + 0x520) = 0
int32_t r1_3 = *(entry_r0 + 0x508)
*(entry_r0 + 0x98) = 0
*(entry_r0 + 0x9c) = 0xffffffff
*(entry_r0 + 0xa0) = 0
*(entry_r0 + 0x50c) = r1_3
__aeabi_memclr4(entry_r0 + 0x528, 0xb8, 0xffffffff)

while (true)
    int32_t r1_4 = *(entry_r0 + 0xd0)
    int32_t* r2_1 = *(entry_r0 + 0xd4)
    
    while (true)
        if (r1_4 == r2_1)
            int32_t r0_5 = *(entry_r0 + 0x514)
            int32_t r1_5 = *(entry_r0 + 0x518)
            
            if (r1_5 != r0_5)
                int32_t r5_1 = (r1_5 - r0_5) s>> 2
                int32_t r7_1 = 0
                
                while (true)
                    void* r0_6 = *(r0_5 + (r7_1 << 2))
                    
                    if (r0_6 != 0)
                        operator delete(r0_6)
                    
                    r7_1 += 1
                    
                    if (r7_1 u>= r5_1)
                        break
                    
                    r0_5 = *(entry_r0 + 0x514)
                
                r0_5 = *(entry_r0 + 0x514)
            
            int32_t r2_2 = *(entry_r0 + 0xdc)
            int32_t i = *(entry_r0 + 0xe0)
            *(entry_r0 + 0x518) = r0_5
            
            if (r2_2 != i)
                do
                    int32_t r2_3 = *(entry_r0 + 0x500)
                    int32_t* r1_7 = i - 4
                    void* r5_2 = *r1_7
                    
                    if (r2_3 != 0)
                        r2_3(*(entry_r0 + 0x504), r5_2)
                        r1_7 = *(entry_r0 + 0xe0) - 4
                    
                    *(entry_r0 + 0xe0) = r1_7
                    ClearAppWorldData(r5_2)
                    
                    if (r5_2 != 0)
                        operator delete(r5_2)
                    
                    i = *(entry_r0 + 0xe0)
                while (*(entry_r0 + 0xdc) != i)
            
            while (true)
                int32_t r0_13 = *(entry_r0 + 0xec)
                
                if (*(entry_r0 + 0xe8) == r0_13)
                    break
                
                AppWorldData* r5_3 = *(r0_13 - 4)
                *(entry_r0 + 0xec) = r0_13 - 4
                ClearAppWorldData(r5_3)
                
                if (r5_3 != 0)
                    operator delete(r5_3)
            
            while (true)
                int32_t r0_17 = *(entry_r0 + 0xf8)
                
                if (*(entry_r0 + 0xf4) == r0_17)
                    break
                
                AppWorldData* r5_4 = *(r0_17 - 4)
                *(entry_r0 + 0xf8) = r0_17 - 4
                ClearAppWorldData(r5_4)
                
                if (r5_4 != 0)
                    operator delete(r5_4)
            
            if (*(entry_r0 + 4) != 0)
                operator delete(CReliableTCPConnectionIPV6::~CReliableTCPConnectionIPV6())
            
            bool cond:0 = *(entry_r0 + 0x5e0) == 0
            *(entry_r0 + 0x8e) = 0
            *(entry_r0 + 4) = 0
            *(entry_r0 + 0x94) = 0
            *(entry_r0 + 0xa4) = 0
            *(entry_r0 + 0xa8) = 0
            *(entry_r0 + 0xb0) = 0
            *(entry_r0 + 0xb4) = 0
            *(entry_r0 + 0xb8) = 0
            *(entry_r0 + 0xbc) = 0
            *(entry_r0 + 0xc0) = 0
            *(entry_r0 + 0xc4) = 0
            *(entry_r0 + 0xc8) = 0
            *(entry_r0 + 0xcc) = 0
            
            if (not(cond:0))
                operator delete(NetworkChatList::~NetworkChatList())
            
            __aeabi_memclr4(entry_r0 + 0x5e0, 0x48)
            int32_t r0_25 = *__stack_chk_guard
            
            if (r0_25 == r0)
                return r0_25 - r0
            
            __stack_chk_fail()
            noreturn
        
        r2_1 -= 4
        void* r0_4 = *r2_1
        *(entry_r0 + 0xd4) = r2_1
        
        if (r0_4 != 0)
            operator delete(r0_4)
            break
