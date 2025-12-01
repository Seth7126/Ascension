// 函数: GetCanUseTempleOfImmortalityForThisCard
// 地址: 0x18b438
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

uint32_t result = 0
int32_t r0 = *__stack_chk_guard
uint32_t r1 = *s_pWorldData
uint32_t r0_1 = 0
int32_t var_48
__builtin_memset(&var_48, 0, 0x20)

if (r1 != 0)
    r0_1 = *(r1 + *(s_InterfaceContext + 0x10) * 0x34 + 0x124)

int32_t r0_4 = core::CWorldBase::GetInstanceByID(r0_1)

if (r0_4 != 0)
    int32_t r0_6 =
        GameOptionManager::IsSelectableInstanceID((*(s_InterfaceContext + 8)).w, arg2 & 0xffff)
    
    if (r0_6 s>= 1)
        int32_t r1_3 = 0
        
        while (true)
            if ((&var_48)[r1_3] - 0xa020 u<= 4)
                result = 0
                void* r0_8 = __dynamic_cast(r0_4, _typeinfo_for_core::CInstance, 
                    _typeinfo_for_core::CCardInstance, 0)
                
                if (r0_8 != 0)
                    void* r0_9 = *(r0_8 + 0xc)
                    
                    if (r0_9 != 0 && *(r0_9 + 0x8c) != 0)
                        void* r0_14 = *(s_InterfaceContext + 0xc)
                        void* var_4c_1 = r0_14
                        int32_t* i = *(r0_14 + 0x48)
                        
                        if (i != *(r0_14 + 0x4c))
                            do
                                void* r9_1 = *i
                                
                                if (strcasecmp(*(*(r9_1 + 0x10) + 0xc) + 4, "Temple of Immortality")
                                        == 0)
                                    int32_t* r8_1 = *(r9_1 + 0x20)
                                    
                                    if (r8_1 != *(r9_1 + 0x24))
                                        while (true)
                                            void* r1_6 = *r8_1
                                            int32_t r0_18 =
                                                GameOptionManager::IsSelectableInstanceID(
                                                (*(s_InterfaceContext + 8)).w, zx.d(*(r1_6 + 8)))
                                            
                                            if (r0_18 s>= 1)
                                                int32_t r1_8 = 0
                                                
                                                while (((&var_48)[r1_8] | 2) != 0xa072)
                                                    r1_8 += 1
                                                    
                                                    if (r1_8 s>= r0_18)
                                                        goto label_18b5e4
                                                
                                                result = zx.d(*(r1_6 + 8))
                                                break
                                            
                                        label_18b5e4:
                                            r8_1 = &r8_1[1]
                                            
                                            if (r8_1 == *(r9_1 + 0x24))
                                                var_4c_1 = *(s_InterfaceContext + 0xc)
                                                goto label_18b62c
                                        
                                        break
                                
                            label_18b62c:
                                i = &i[1]
                            while (i != *(var_4c_1 + 0x4c))
                
                break
            
            r1_3 += 1
            
            if (r1_3 s>= r0_6)
                result = 0
                break

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
