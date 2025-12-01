// 函数: _ZN9ascension7CPlayerD1Ev
// 地址: 0xed098
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void** entry_r0
int32_t* r0 = entry_r0[0xe]
*entry_r0 = _vtable_for_ascension::CPlayer + 8

if (r0 != 0)
    (*(*r0 + 4))()

int32_t* r0_1 = entry_r0[0xf]

if (r0_1 != 0)
    (*(*r0_1 + 4))()

int32_t* r0_2 = entry_r0[0x10]

if (r0_2 != 0)
    (*(*r0_2 + 4))()

int32_t* r0_3 = entry_r0[0x11]

if (r0_3 != 0)
    (*(*r0_3 + 4))()

int32_t* r0_4 = entry_r0[0x21]

if (r0_4 != 0)
    (*(*r0_4 + 4))()

while (true)
    int32_t r1_11 = entry_r0[0x1f]
    
    if (entry_r0[0x1e] == r1_11)
        break
    
    CState* r0_6 = *(r1_11 - 4)
    entry_r0[0x1f] = r1_11 - 4
    CState::DeleteState(r0_6)

while (true)
    int32_t r1_15 = entry_r0[0x12]
    int32_t* r2_1 = entry_r0[0x13]
    
    while (true)
        if (r1_15 == r2_1)
            while (true)
                int32_t r1_18 = entry_r0[0x15]
                int32_t* r2_2 = entry_r0[0x16]
                
                while (true)
                    if (r1_18 == r2_2)
                        while (true)
                            int32_t r1_21 = entry_r0[0x18]
                            int32_t* r2_3 = entry_r0[0x19]
                            
                            while (true)
                                if (r1_21 == r2_3)
                                    while (true)
                                        int32_t r1_24 = entry_r0[0x1b]
                                        int32_t* r2_4 = entry_r0[0x1c]
                                        int32_t* i
                                        
                                        do
                                            if (r1_24 == r2_4)
                                                void* r5 = entry_r0[0x5d]
                                                
                                                if (r5 != 0)
                                                    int32_t r1_25 = entry_r0[0x5e]
                                                    void* r0_11
                                                    
                                                    if (r1_25 == r5)
                                                        r0_11 = r5
                                                    else
                                                        bool cond:0_1
                                                        
                                                        do
                                                            void* r0_10 = *(r1_25 - 0xc)
                                                            
                                                            if (r0_10 != 0)
                                                                *(r1_25 - 8) = r0_10
                                                                operator delete(r0_10)
                                                            
                                                            cond:0_1 = r5 != r1_25 - 0x1c
                                                            r1_25 -= 0x1c
                                                        while (cond:0_1)
                                                        r0_11 = entry_r0[0x5d]
                                                    
                                                    entry_r0[0x5e] = r5
                                                    operator delete(r0_11)
                                                
                                                void* r0_12 = entry_r0[0x1e]
                                                
                                                if (r0_12 != 0)
                                                    entry_r0[0x1f] = r0_12
                                                    operator delete(r0_12)
                                                
                                                void* r0_13 = entry_r0[0x1b]
                                                
                                                if (r0_13 != 0)
                                                    entry_r0[0x1c] = r0_13
                                                    operator delete(r0_13)
                                                
                                                void* r0_14 = entry_r0[0x18]
                                                
                                                if (r0_14 != 0)
                                                    entry_r0[0x19] = r0_14
                                                    operator delete(r0_14)
                                                
                                                void* r0_15 = entry_r0[0x15]
                                                
                                                if (r0_15 != 0)
                                                    entry_r0[0x16] = r0_15
                                                    operator delete(r0_15)
                                                
                                                void* r0_16 = entry_r0[0x12]
                                                
                                                if (r0_16 != 0)
                                                    entry_r0[0x13] = r0_16
                                                    operator delete(r0_16)
                                                
                                                return core::CPlayerBase::~CPlayerBase() __tailcall
                                            
                                            r2_4 -= 4
                                            i = *r2_4
                                            entry_r0[0x1c] = r2_4
                                        while (i == 0)
                                        
                                        (*(*i + 4))()
                                else
                                    r2_3 -= 4
                                    int32_t* r0_9 = *r2_3
                                    entry_r0[0x19] = r2_3
                                    
                                    if (r0_9 != 0)
                                        (*(*r0_9 + 4))()
                                        break
                    else
                        r2_2 -= 4
                        int32_t* r0_8 = *r2_2
                        entry_r0[0x16] = r2_2
                        
                        if (r0_8 != 0)
                            (*(*r0_8 + 4))()
                            break
        else
            r2_1 -= 4
            int32_t* r0_7 = *r2_1
            entry_r0[0x13] = r2_1
            
            if (r0_7 != 0)
                (*(*r0_7 + 4))()
                break
