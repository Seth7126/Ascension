// 函数: _ZN9ascension6CWorld30ShuffleVoidCardsIntoPortalDeckEv
// 地址: 0xf47cc
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
int32_t* var_44 = nullptr
core::CCardInstance* const& var_48 = nullptr
int32_t var_40 = 0
core::CStateChangeMessage* entry_r0

if (*(*(entry_r0 + 0xa3c) + 0x18) == 0)
    void* r5_1 = *(entry_r0 + 0xa4c)
    
    if (*(r5_1 + 0x18) s>= 1)
        if (*(entry_r0 + 0x30) u> 0x19)
            int32_t r0_16 = *(r5_1 + 0xc)
            int32_t r1_4 = *(r5_1 + 0x10) - r0_16
            
            if (r1_4 s>= 1)
                uint32_t r6_1 = r1_4 u>> 2
                
                while (true)
                    void* r1_5 = *(r0_16 + ((r6_1 - 1) << 2))
                    int32_t* r2_2 = *(entry_r0 + 0xbd8)
                    int32_t r0_17 = *(entry_r0 + 0xbdc)
                    
                    if (r2_2 != r0_17)
                        while (true)
                            int32_t r3_1 = *r2_2
                            r2_2 = &r2_2[2]
                            
                            if (r3_1 == r1_5)
                                break
                            
                            if (r0_17 == r2_2)
                                goto label_f491c
                        
                        goto label_f4968
                    
                label_f491c:
                    core::CCardStack::RemoveCard(*(entry_r0 + 0xa4c))
                    
                    if (*(*(r1_5 + 0xc) + 0x88) != 5)
                        core::CCardStack::AddCard(*(entry_r0 + 0xa3c))
                    label_f4968:
                        
                        if (r6_1 s< 2)
                            break
                    else
                        if (var_44 == var_40)
                            std::__ndk1::vector<core::CCardInstance*, std::__ndk1::allocator<core::CCardInstance*> >::__push_back_slow_path<core::CCardInstance* const&>(
                                &var_48)
                            goto label_f4968
                        
                        *var_44 = r1_5
                        var_44 = &var_44[1]
                        
                        if (r6_1 s< 2)
                            break
                    
                    r0_16 = *(r5_1 + 0xc)
                    r6_1 -= 1
        else
            while (true)
                void* r0_8 = core::CCardStack::RemoveTopCard()
                void* var_4c_1 = r0_8
                
                if (r0_8 == 0)
                    break
                
                if (*(*(r0_8 + 0xc) + 0x88) != 5)
                    core::CCardStack::AddCard(*(entry_r0 + 0xa3c))
                else if (var_44 == var_40)
                    std::__ndk1::vector<core::CCardInstance*, std::__ndk1::allocator<core::CCardInstance*> >::__push_back_slow_path<core::CCardInstance* const&>(
                        &var_48)
                else
                    *var_44 = r0_8
                    var_44 = &var_44[1]
                    *(entry_r0 + 0xa4c)
                    continue
                
                *(entry_r0 + 0xa4c)
        
        *(entry_r0 + 0xa3c)
        core::CCardStack::Shuffle()
        int32_t* r0_27 = var_44
        
        if (var_48 != r0_27)
            do
                *(r0_27 - 4)
                core::CCardStack::PutCardOnBottom(*(entry_r0 + 0xa4c))
                r0_27 = var_44 - 4
                var_44 = r0_27
            while (var_48 != r0_27)
        
        core::CWorldBase::OutputMessage(entry_r0)
        void* r0_31 = *(entry_r0 + 0xa3c)
        
        if (*(r0_31 + 0x18) s>= 1)
            uint32_t r0_32 = zx.d(*(r0_31 + 8))
            int32_t var_38_1 = 1
            int32_t var_3c = 0x8000003
            int32_t var_34_1 = 0
            uint32_t var_30_1 = r0_32
            int32_t var_2c_1 = 0
            core::CWorldBase::SendStateChange(entry_r0, &var_3c)
        
        core::CCardInstance* const& r0_34 = var_48
        
        if (r0_34 != 0)
            core::CCardInstance* const& var_44_1 = r0_34
            operator delete(r0_34)

int32_t r0_3 = *__stack_chk_guard

if (r0_3 == r0)
    return r0_3 - r0

__stack_chk_fail()
noreturn
