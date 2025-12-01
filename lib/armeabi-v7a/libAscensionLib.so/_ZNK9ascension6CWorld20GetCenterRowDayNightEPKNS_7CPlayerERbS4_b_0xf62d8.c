// 函数: _ZNK9ascension6CWorld20GetCenterRowDayNightEPKNS_7CPlayerERbS4_b
// 地址: 0xf62d8
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t arg_0
int32_t r12 = arg_0
int32_t r3 = 0
int32_t r7 = 0
int32_t r0 = *__stack_chk_guard
int32_t* lr = *(arg1 + 0xa40)
void* r4 = *(arg1 + 0xa44) - lr
char r0_2 = 0

if (r4 s>= 1)
    void* r3_1 = *lr
    int32_t r7_1 = *(r3_1 + 0x10)
    r3 = 0
    
    if (*(r3_1 + 0xc) == r7_1)
        r7 = 0
        
        if (r4 s> 4)
        label_f636c:
            void* r5_3 = lr[1]
            int32_t r5_4 = *(r5_3 + 0x10)
            
            if (*(r5_3 + 0xc) != r5_4)
                void* r5_5 = *(r5_4 - 8)
                
                if (r5_5 != 0)
                    void* r2_1 = *(r5_5 + 0xc)
                    r7 += *(r2_1 + 0xdc)
                    r3 += *(r2_1 + 0xe0)
            
            if (r4 s>= 9)
                void* r2_3 = lr[2]
                int32_t r5_7 = *(r2_3 + 0x10)
                
                if (*(r2_3 + 0xc) != r5_7)
                    void* r5_8 = *(r5_7 - 8)
                    
                    if (r5_8 != 0)
                        void* r2_4 = *(r5_8 + 0xc)
                        r7 += *(r2_4 + 0xdc)
                        r3 += *(r2_4 + 0xe0)
                
                if (r4 s< 0xd)
                    r12 = arg_0
                else
                    void* r2_6 = lr[3]
                    int32_t r5_10 = *(r2_6 + 0x10)
                    
                    if (*(r2_6 + 0xc) != r5_10)
                        void* r5_11 = *(r5_10 - 8)
                        
                        if (r5_11 != 0)
                            void* r2_7 = *(r5_11 + 0xc)
                            r7 += *(r2_7 + 0xdc)
                            r3 += *(r2_7 + 0xe0)
                    
                    if (r4 s< 0x11)
                        r12 = arg_0
                    else
                        void* r2_9 = lr[4]
                        int32_t r5_13 = *(r2_9 + 0x10)
                        
                        if (*(r2_9 + 0xc) != r5_13)
                            void* r5_14 = *(r5_13 - 8)
                            
                            if (r5_14 != 0)
                                void* r2_10 = *(r5_14 + 0xc)
                                r7 += *(r2_10 + 0xdc)
                                r3 += *(r2_10 + 0xe0)
                        
                        if (r4 s< 0x15)
                            r12 = arg_0
                        else
                            void* r2_12 = lr[5]
                            int32_t r5_16 = *(r2_12 + 0x10)
                            r12 = arg_0
                            
                            if (*(r2_12 + 0xc) != r5_16)
                                void* r5_17 = *(r5_16 - 8)
                                
                                if (r5_17 != 0)
                                    void* r2_13 = *(r5_17 + 0xc)
                                    r7 += *(r2_13 + 0xdc)
                                    r3 += *(r2_13 + 0xe0)
                            
                            if (r4 s>= 0x19)
                                void* r2_15 = lr[6]
                                int32_t r2_16 = *(r2_15 + 0x10)
                                
                                if (*(r2_15 + 0xc) != r2_16)
                                    void* r2_17 = *(r2_16 - 8)
                                    
                                    if (r2_17 != 0)
                                        void* r2_18 = *(r2_17 + 0xc)
                                        r7 += *(r2_18 + 0xdc)
                                        r3 += *(r2_18 + 0xe0)
    else
        void* r5_2 = *(r7_1 - 8)
        r7 = 0
        
        if (r5_2 != 0)
            void* r3_2 = *(r5_2 + 0xc)
            r7 = *(r3_2 + 0xdc)
            r3 = *(r3_2 + 0xe0)
        
        if (r4 s> 4)
            goto label_f636c

int32_t var_78 = 9
int32_t var_74 = 0
void* __offset(vtable_for_ascension::CEventQueryDayNight, 0x8) var_7c =
    _vtable_for_ascension::CEventQueryDayNight + 8
bool& var_30 = arg2
bool r1 = false

if (r7 s> r3)
    r1 = true

if (r3 s> r7)
    r0_2 = 1

if (r12 != 0)
    ascension::CWorld** i = *(arg1 + 0xaa4)
    
    for (int32_t r2_21 = *(arg1 + 0xaa8); i != r2_21; i = &i[1])
        ascension::CWorld* r0_3 = *i
        
        if ((zx.d(*(r0_3 + 0x149)) & 2) != 0)
            ascension::CActiveEffectInstance::HandleQuery(r0_3, arg1)
            r2_21 = *(arg1 + 0xaa8)

*arg3 = r1
*arg4 = r0_2
ascension::CEvent::~CEvent()
int32_t r0_4 = *__stack_chk_guard

if (r0_4 == r0)
    return r0_4 - r0

__stack_chk_fail()
noreturn
