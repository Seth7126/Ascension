// 函数: _ZN14ascensionrules45CStateProcessCopyEffectFromTopOfAnyPlayerDeck11UpdateStateER13CStateMachine
// 地址: 0x1501ec
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t entry_r9
int32_t var_10 = entry_r9

if (*(arg1 + 0x30) != 0 || *(arg1 + 0x38) s> 0 || zx.d(*(arg1 + 0x268)) != 0)
    return CGameStateOptions::UpdateState(arg1) __tailcall

void* r2_1 = *(arg1 + 0x24c)
void* r1_2 = *(arg1 + 0x254)
void* r0_5 = *(r2_1 + 4)

if (r1_2 != 0)
    entry_r9 = *(r1_2 + 0xc)

if (r1_2 == 0)
    entry_r9 = 0

int32_t r0_7 = *(r0_5 + 0x1c) - *(r0_5 + 0x18)
int32_t (* const var_30)(CStateMachine&, CState*, int32_t, uint32_t*)
void* var_2c

if (r0_7 s>= 1)
    int32_t i = 0
    
    do
        void* r0_8 = *(arg1 + 0x258 + (i << 2))
        
        if (r0_8 != 0)
            void* r1_4 = *(r0_8 + 0xc)
            
            if (zx.d(*(r1_4 + 0xc9)) == 0 && r1_4 != entry_r9 && *(r1_4 + 0x88) == 1)
                var_2c = r0_8
                var_30 = ascensionrules::CStateProcessCopyEffectFromTopOfAnyPlayerDeck::SelectEffectToCopy
                CGameStateOptions::AddSimpleUserOption(arg1.w, *(r0_8 + 8), 0xa081, "Copy %s", 
                    var_30)
        
        i += 1
    while (i s< r0_7 s>> 2)
    
    r2_1 = *(arg1 + 0x24c)

int32_t entry_r1
(*(*arg1 + 0x34))(arg1, entry_r1, r2_1, "Select Effect to Copy", var_30, var_2c)
*(arg1 + 0x268) = 1
return 1
