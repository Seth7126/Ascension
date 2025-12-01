// 函数: _ZN9ascension5CCardD1Ev
// 地址: 0xe1720
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void** entry_r0
int32_t r0 = entry_r0[0x3a]
*entry_r0 = _vtable_for_ascension::CCard + 8

if (r0 != 0)
    operator delete(ascension::CEffect::~CEffect())

if (entry_r0[0x3b] != 0)
    operator delete(ascension::CEffect::~CEffect())

if (entry_r0[0x3c] != 0)
    operator delete(ascension::CEffect::~CEffect())

if (entry_r0[0x3d] != 0)
    operator delete(ascension::CEffect::~CEffect())

if (entry_r0[0x3e] != 0)
    operator delete(ascension::CEffect::~CEffect())

void* r0_11

if (entry_r0[0x3f] != 0)
    r0_11 = ascension::CEffect::~CEffect()
    goto label_e17b0

while (true)
    int32_t r1_1 = entry_r0[0x40]
    int32_t* r2_1 = entry_r0[0x41]
    
    while (true)
        if (r1_1 == r2_1)
            while (true)
                int32_t r1_2 = entry_r0[0x43]
                int32_t* r2_2 = entry_r0[0x44]
                
                while (true)
                    if (r1_2 == r2_2)
                        while (true)
                            int32_t r1_5 = entry_r0[0x46]
                            int32_t* r2_3 = entry_r0[0x47]
                            
                            while (true)
                                if (r1_5 == r2_3)
                                    while (true)
                                        int32_t r1_8 = entry_r0[0x49]
                                        int32_t* r2_4 = entry_r0[0x4a]
                                        int32_t* i
                                        
                                        do
                                            if (r1_8 == r2_4)
                                                int32_t* r2_5 = entry_r0[0x4c]
                                                int32_t* r0_16 = entry_r0[0x4d]
                                                
                                                if (r2_5 == r0_16)
                                                    if (r2_5 != 0)
                                                        entry_r0[0x4d] = r2_5
                                                        operator delete(r2_5)
                                                else
                                                    do
                                                        r0_16 -= 4
                                                        int32_t* r1_9 = *r0_16
                                                        entry_r0[0x4d] = r0_16
                                                        
                                                        if (r1_9 != 0)
                                                            (*(*r1_9 + 4))(r1_9)
                                                            r2_5 = entry_r0[0x4c]
                                                            r0_16 = entry_r0[0x4d]
                                                    while (r2_5 != r0_16)
                                                    
                                                    if (r0_16 != 0)
                                                        entry_r0[0x4d] = r0_16
                                                        operator delete(r0_16)
                                                
                                                void* r0_19 = entry_r0[0x49]
                                                
                                                if (r0_19 != 0)
                                                    entry_r0[0x4a] = r0_19
                                                    operator delete(r0_19)
                                                
                                                void* r0_20 = entry_r0[0x46]
                                                
                                                if (r0_20 != 0)
                                                    entry_r0[0x47] = r0_20
                                                    operator delete(r0_20)
                                                
                                                void* r0_21 = entry_r0[0x43]
                                                
                                                if (r0_21 != 0)
                                                    entry_r0[0x44] = r0_21
                                                    operator delete(r0_21)
                                                
                                                void* r0_22 = entry_r0[0x40]
                                                
                                                if (r0_22 != 0)
                                                    entry_r0[0x41] = r0_22
                                                    operator delete(r0_22)
                                                
                                                return core::CCard::~CCard() __tailcall
                                            
                                            r2_4 -= 4
                                            i = *r2_4
                                            entry_r0[0x4a] = r2_4
                                        while (i == 0)
                                        
                                        (*(*i + 4))()
                                else
                                    r2_3 -= 4
                                    int32_t* r0_15 = *r2_3
                                    entry_r0[0x47] = r2_3
                                    
                                    if (r0_15 != 0)
                                        (*(*r0_15 + 4))()
                                        break
                    else
                        r2_2 -= 4
                        int32_t r0_14 = *r2_2
                        entry_r0[0x44] = r2_2
                        
                        if (r0_14 != 0)
                            operator delete(ascension::CConstructAbilityDefinition::~CConstructAbilityDefinition())
                            break
        else
            r2_1 -= 4
            int32_t r0_12 = *r2_1
            entry_r0[0x41] = r2_1
            
            if (r0_12 != 0)
                r0_11 = ascension::CCardInPlayAbilityDefinition::~CCardInPlayAbilityDefinition()
                break
    
label_e17b0:
    operator delete(r0_11)
