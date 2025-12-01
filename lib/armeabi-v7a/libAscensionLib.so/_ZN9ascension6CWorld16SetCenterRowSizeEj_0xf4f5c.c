// 函数: _ZN9ascension6CWorld16SetCenterRowSizeEj
// 地址: 0xf4f5c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t entry_r1

if (*(arg1 + 0xb10) != entry_r1)
    int32_t var_48
    
    for (int32_t i = 0; i != 7; i += 1)
        int32_t i_1
        
        if (i s>= entry_r1)
            int32_t r0_10 = *(arg1 + 0xa40)
            
            if (i s< (*(arg1 + 0xa44) - r0_10) s>> 2)
                void* j_2 = ascension::CCenterRowInstance::RemoveTopCard((*(r0_10 + (i << 2))).b, 1)
                
                if (j_2 != 0)
                    void* j_1 = j_2
                    void* j
                    
                    do
                        ascension::CWorld::PutCardInVoid(arg1)
                        var_48 = 0x8000001
                        int32_t var_44_3 = 0x7000601
                        i_1.b = 9
                        int32_t i_3 = i
                        int32_t var_38_2 = 0
                        struct Elf32_Header* const var_30_2 = &__elf_header
                        uint32_t var_34_2 = zx.d(*(j_1 + 8))
                        int32_t var_2c_2 = 0
                        core::CWorldBase::SendStateChange(arg1, &var_48)
                        int32_t r0_15 = *(arg1 + 0xa40)
                        
                        if (i s>= (*(arg1 + 0xa44) - r0_15) s>> 2)
                            break
                        
                        j = ascension::CCenterRowInstance::RemoveTopCard((*(r0_15 + (i << 2))).b, 1)
                        j_1 = j
                    while (j != 0)
            
            if (i s< *(arg1 + 0xb10))
                int32_t var_44_4 = 0x27
                var_48 = 0x8000003
                i_1 = i
                int32_t var_3c_2 = 0
                int32_t var_38_3 = 0
                core::CWorldBase::SendStateChange(arg1, &var_48)
        else
            if (i s>= *(arg1 + 0xb10))
                int32_t var_44_1 = 0x27
                var_48 = 0x8000003
                i_1 = i
                int32_t var_3c_1 = 1
                int32_t var_38_1 = 0
                core::CWorldBase::SendStateChange(arg1, &var_48)
            
            int32_t r0_4 = *(arg1 + 0xa40)
            
            if (i s< (*(arg1 + 0xa44) - r0_4) s>> 2)
                void* r0_5 = *(r0_4 + (i << 2))
                int32_t r0_6 = *(r0_5 + 0x10)
                
                if (*(r0_5 + 0xc) != r0_6)
                    void* r0_7 = *(r0_6 - 8)
                    
                    if (r0_7 != 0)
                        var_48 = 0x8000001
                        int32_t var_44_2 = 0x7000001
                        i_1.b = 7
                        int32_t i_2 = i
                        int32_t i_4 = i
                        int32_t var_30_1 = 0
                        uint32_t var_34_1 = zx.d(*(r0_7 + 8))
                        int32_t var_2c_1 = 0
                        core::CWorldBase::SendStateChange(arg1, &var_48)
    
    int32_t var_44_5 = 2
    var_48 = 0x8000002
    int32_t var_34_3 = 0
    int32_t var_38_4 = 0
    int32_t var_3c_3 = 0
    int32_t var_40 = 0
    core::CWorldBase::SendStateChange(arg1, &var_48)
    void* r0_20 = core::CWorldBase::AddRollbackData(arg1, 0, &__elf_program_headers[1].align:3)
    
    if (r0_20 != 0)
        *(r0_20 + 0xc) = *(arg1 + 0xb10)
    
    *(arg1 + 0xb10) = entry_r1

int32_t r0_21 = *__stack_chk_guard

if (r0_21 == r0)
    return r0_21 - r0

__stack_chk_fail()
noreturn
